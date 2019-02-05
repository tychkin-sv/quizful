package question_032;
// Из какой структуры данных "сборщик мусора" удалит все элементы у которых исчезла последняя ссылка на их ключ в этой структуре?
// WeakHashMap
import java.util.Map;
import java.util.WeakHashMap;

public class WeakTest {
/*
Пояснение:
WeakHashMap, фактически, хранит не пары "ключ - значение", а пары "слабая ссылка на ключ - значение". Особенность слабых ссылок (WeakReference) состоит в том, что они игнорируются сборщиком мусора, т.е. если на объект-ключ нет других ссылок, он уничтожается.
Перед любым обращением к WeakHashMap (get(), put(), size() и т.д.) анализируются невалидные ссылки и соответствующая пара удаляется.
Код для демонстрации:
 */
    public static void main(String[] args) {
        Map map = new WeakHashMap();
        Object obj = new Object(); // создаём объект
        map.put(obj, "object"); // кладём его в мапу
        System.out.println(map.size()); // в мапе один элемент
        obj = null; // чистим ссылку
        System.gc(); // играемся со сборщиком мусора
        System.runFinalization();
        System.out.println(map.size()); // мапа должна стать пустой
    }
}
