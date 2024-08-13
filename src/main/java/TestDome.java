import java.util.function.Supplier;

//public class TestDome {
//
//import java.util.*;
//
//public class InefficientMethods {
//
//    public static String buildRepeatedSequence(String sequence, int repetitions) {
//        return String.valueOf(sequence).repeat(Math.max(0, repetitions));
//    }
//
//    public static int countUniqueIntegers(Collection<Integer> integers) {
//        List<Integer> list = new ArrayList<>(integers);
//        int matchCount = 0;
//
//        HashSet<Integer> uniqueIntegers = new HashSet<>();
//        for (Integer integer : list) {
//            if (uniqueIntegers.contains(integer)) {
//                matchCount++;
//            }
//            uniqueIntegers.add(integer);
//        }
//
////        for (int i = 0; i < integers.size(); ++i) {
////            boolean isUnique = true;
////            for (int j = i + 1; j < integers.size(); ++j) {
////                if (list.get(i).equals(list.get(j))) {
////                    isUnique = false;
////                    break;
////                }
////            }
////            if (isUnique) {
////                ++matchCount;
////            }
////        }
//        return matchCount;
//    }
//}

//import org.xml.sax.SAXException;
//
//import javax.swing.text.Document;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.util.Objects;

//public class FamilyMember {
//
//    private String name;
//
//    // These mother and father fields will be null if unknown.
//    private FamilyMember mother, father;
//
//    public FamilyMember(String name, FamilyMember mother, FamilyMember father) {
//        this.name = Objects.requireNonNull(name);
//        this.mother = mother;
//        this.father = father;
//    }
//
//    public boolean isAncestorOf(FamilyMember person) {
//        //implement this method, so it returns true if and only if this person
//        //is an ancestor of the given person. A person's ancestor include
//        //their parents, grandparents, great-grandparents, and so on up the family tree.
//        if (person.mother == null) return false;
//        if (person.father == null) return false;
//        FamilyMember familyMember = new FamilyMember(person.name, person.mother, person.father);
//        if (familyMember.equals(mother) || familyMember.equals(father)) {
//            return true;
//        }
//        if (familyMember.mother.equals(person.mother)) return true;
//        if (familyMember.equals(father.father)) return true;
//
//        throw new UnsupportedOperationException("You need to implement this!");
//    }
//}

//import java.util.Collections;
//import java.util.Collection;
//import java.util.Map;
//import java.util.Set;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Arrays;
//
//public class PopularityContest
//{
//    public static Collection<String> findPopularPair(Map<String, Collection<String>> friendMap) {
//        int max = Integer.MIN_VALUE;
////        Map<String, Integer>
//        Collection<String> popularPairs = new HashSet<>();
//        for (int i = 0; i < friendMap.size(); i++) {
//            if (friendMap.values().size() > 1) {
//                if (max < friendMap.values().stream().mapToInt(Collection::size).sum()) {
//                    max = friendMap.values().stream().mapToInt(Collection::size).sum();
//                }
//                max = friendMap.values().stream().mapToInt(Collection::size).sum();
//                break;
//            }
//            popularPairs.add()
//        }
//        throw new UnsupportedOperationException("You need to implement this method!");
//    }
//
//    public static void main(String[] args) {
//        Map<String, Collection<String>> friendMap = new HashMap<>();
//        friendMap.put("Abbey", Arrays.asList("Ben"));
//        friendMap.put("Ben", Arrays.asList("Abbey", "Hattie"));
//        friendMap.put("Caitlin", Arrays.asList("Ben", "Deborah", "Eddie", "Jonas"));
//        friendMap.put("Deborah", Arrays.asList("Abbey", "Ben", "Frank"));
//        friendMap.put("Eddie", Arrays.asList("Jonas"));
//        friendMap.put("Frank", Collections.emptySet());
//        friendMap.put("Gertie", Arrays.asList("Abbey", "Deborah"));
//        friendMap.put("Hattie", Arrays.asList("Ben"));
//        friendMap.put("Ingrid", Arrays.asList("Ben", "Caitlin", "Deborah", "Eddie", "Frank", "Gertie", "Hattie", "Jonas"));
//        friendMap.put("Jonas", Arrays.asList("Eddie"));
//        Collection<String> popularPair = findPopularPair(friendMap);
//        // We should see "Caitlin" and "Ingrid" in the returned Collection,
//        // because they are the two who are liked by the most people.
//        System.out.println("Most liked people are " + popularPair);
//    }
//}

//import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class SelectivePriceExtractor {
//
//    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
//        String html = "<html><body>"
//                + "<div class='offer' id='hotelPricing'><ul>"
//                + "<li><span class='price'>70.00</span> <span class='desc'>Room price</span></li>"
//                + "<li><span class='price'>3.99</span> <span class='desc'>Card surcharge</span></li>"
//                + "</ul></div>"
//                + "<div class='offer' id='flightPricing'><ul>"
//                + "<li><span class='price'>42.88</span> <span class='desc'>Base fare</span></li>"
//                + "<li><span class='price'>1.99</span> <span class='desc'>Booking fee</span></li>"
//                + "<li><span class='price'>3.99</span> <span class='desc'>Card surcharge</span></li>"
//                + "<li><span class='price'>32.99</span> <span class='desc'>Fuel surcharge</span></li>"
//                + "<li><span class='price'>12.99</span> <span class='desc'>National development tax</span></li>"
//                + "</ul></div>"
//                + "<div class='offer' id='carHirePricing'><ul>"
//                + "<li><span class='price'>128.57</span> <span class='desc'>Hire charge</span></li>"
//                + "<li><span class='price'>52.43</span> <span class='desc'>Insurance</span></li>"
//                + "<li><span class='price'>1.29</span> <span class='desc'>Card surcharge</span></li>"
//                + "<li><span class='price'>48.00</span> <span class='desc'>Full tank of fuel</span></li>"
//                + "</ul></div>"
//                + "</body></html>";
//        Map<String, BigDecimal> priceMap = extractFlightPricing(html);
//        System.out.println("Pricing:\n" + priceMap);
//    }
//
//    public static Map<String, BigDecimal> extractFlightPricing(String html) throws ParserConfigurationException, IOException, SAXException {
//        Map<String, BigDecimal> map = new HashMap<>();
//        // TODO: Complete this method.
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
//
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = factory.newDocumentBuilder();
//
//        Document document = (Document) builder.parse(inputStream).getDocumentElement();
//
//
//
//        return map;
//    }
//}

//import java.util.Objects;
//import java.util.function.Supplier;
//
//    interface EggLayer<T extends EggLayer<T>> {
//        public Egg<T> lay();
//    }
//
//    public class Stegosaurus implements EggLayer{
//        @Override
//        public Egg lay() {
//            return null;
//        }
//
//        Stegosaurus hash() {
//            return new Stegosaurus();
//        }
//    }
//
//    class Egg<T extends EggLayer<T>> {
//        public Egg(Supplier<T> supplier) {
//            Stegosaurus stegosaurus = new Stegosaurus();
//            stegosaurus.lay();
//            throw new UnsupportedOperationException("You need to implement this constructor!");
//        }
//
//        public T hatch() {
//            Stegosaurus stegosaurus = new Stegosaurus();
//            if (stegosaurus.lay().hatch()){
//                throw  new IllegalStateException();
//            }
//            stegosaurus.hash();
//            throw new UnsupportedOperationException("You need to implement this method!");
//        }
//    }
//
//}
