import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";

        List<String> solarSystem = createUnmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter)));
        ArrayList<String> solarSystem1 = new ArrayList<>(Arrays.asList(mercury, venus, earth));
        ArrayList<String> solarSystem2 = new ArrayList<>(Arrays.asList(mars, jupiter, earth));
        System.out.println(solarSystem);
        Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(jupiter));
        Collections.sort(solarSystem);
        Collections.reverse(solarSystem);

        System.out.println(Collections.disjoint(solarSystem1, solarSystem2));

        add(solarSystem1, "Уран");
        remove(solarSystem1, "Меркурий");
        edit(solarSystem1, "Нептун", 1);
        shuffle(solarSystem1);
        System.out.println(getRandomPlanet(solarSystem1));
        System.out.println(getIndex(solarSystem1, "Уран"));
        System.out.println(isContains(solarSystem1, "Нептун"));

        System.out.println(Collections.binarySearch(solarSystem, "Земля"));     // Бинарный поиск элемента
        System.out.println(Collections.max(solarSystem));                           // Возвращает максимальный элемент списка
    }

    public static List<String> createUnmodifiableList(List<String> list) { return new ArrayList<>(Collections.unmodifiableList(new ArrayList<>(list))); }

    public static void add(List<String> solar, String elem) { solar.add(solar.size(), elem); }

    public static void remove(List<String> solar, String elem)
    {
        solar.remove(elem);
    }

    public static void edit(List<String> solar, String elem, int index)
    {
        solar.set(index, elem);
    }

    public static void shuffle(List<String> solar)
    {
        Collections.shuffle(solar);
    }

    public static String getRandomPlanet(List<String> solar)
    {
        return solar.get(new Random().nextInt(solar.size()));
    }

    public static int getIndex(List<String> solar, String elem)
    {
        return solar.indexOf(elem);
    }

    public static boolean isContains(List<String> solar, String elem)
    {
        return solar.contains(elem);
    }
}