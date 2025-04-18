import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LanguageTranslatorChatbot {

    private static final Map<String, Map<String, String>> translationDictionary = new HashMap<>();

    static {
        // English to German translations
        Map<String, String> germanTranslations = new HashMap<>();
        germanTranslations.put("hello", "Hallo");
        germanTranslations.put("how are you", "Wie geht es Ihnen?");
        germanTranslations.put("good morning", "Guten Morgen");
        germanTranslations.put("thank you", "Danke");
        germanTranslations.put("goodbye", "Auf Wiedersehen");
        germanTranslations.put("what is your name", "Wie heißen Sie?");
        germanTranslations.put("where are you from", "Woher kommen Sie?");
        germanTranslations.put("how old are you", "Wie alt sind Sie?");
        germanTranslations.put("what time is it", "Wie spät ist es?");
        germanTranslations.put("how do you say", "Wie sagt man");
        germanTranslations.put("where is the restroom", "Wo ist die Toilette?");
        germanTranslations.put("I am hungry", "Ich habe Hunger");
        germanTranslations.put("how much does it cost", "Wie viel kostet es?");
        germanTranslations.put("can you help me", "Können Sie mir helfen?");
        germanTranslations.put("I love you", "Ich liebe dich");
        // Add more German translations here...

        // English to Turkish translations
        Map<String, String> turkishTranslations = new HashMap<>();
        turkishTranslations.put("hello", "Merhaba");
        turkishTranslations.put("how are you", "Nasılsınız?");
        turkishTranslations.put("good morning", "Günaydın");
        turkishTranslations.put("thank you", "Teşekkür ederim");
        turkishTranslations.put("goodbye", "Hoşça kal");
        turkishTranslations.put("what is your name", "Adınız ne?");
        turkishTranslations.put("where are you from", "Nerelisiniz?");
        turkishTranslations.put("how old are you", "Kaç yaşındasınız?");
        turkishTranslations.put("what time is it", "Saat kaç?");
        turkishTranslations.put("how do you say", "Nasıl söylersiniz");
        turkishTranslations.put("where is the restroom", "Tuvalet nerede?");
        turkishTranslations.put("I am hungry", "Açım");
        turkishTranslations.put("how much does it cost", "Ne kadar tutar?");
        turkishTranslations.put("can you help me", "Bana yardım eder misiniz?");
        turkishTranslations.put("I love you", "Seni seviyorum");
        // Add more Turkish translations here...

        // English to Arabic translations
        Map<String, String> arabicTranslations = new HashMap<>();
        arabicTranslations.put("hello", "مرحبا");
        arabicTranslations.put("how are you", "كيف حالك؟");
        arabicTranslations.put("good morning", "صباح الخير");
        arabicTranslations.put("thank you", "شكرا لك");
        arabicTranslations.put("goodbye", "وداعا");
        arabicTranslations.put("what is your name", "ما اسمك؟");
        arabicTranslations.put("where are you from", "من أين أنت؟");
        arabicTranslations.put("how old are you", "كم عمرك؟");
        arabicTranslations.put("what time is it", "كم الساعة؟");
        arabicTranslations.put("how do you say", "كيف تقول");
        arabicTranslations.put("where is the restroom", "أين الحمام؟");
        arabicTranslations.put("I am hungry", "أنا جائع");
        arabicTranslations.put("how much does it cost", "كم يكلف؟");
        arabicTranslations.put("can you help me", "هل يمكنك مساعدتي؟");
        arabicTranslations.put("I love you", "أحبك");
        // Add more Arabic translations here...

        // English to Chinese translations
        Map<String, String> chineseTranslations = new HashMap<>();
        chineseTranslations.put("hello", "你好");
        chineseTranslations.put("how are you", "你好吗？");
        chineseTranslations.put("good morning", "早上好");
        chineseTranslations.put("thank you", "谢谢");
        chineseTranslations.put("goodbye", "再见");
        chineseTranslations.put("what is your name", "你叫什么名字？");
        chineseTranslations.put("where are you from", "你从哪里来？");
        chineseTranslations.put("how old are you", "你多大了？");
        chineseTranslations.put("what time is it", "现在几点了？");
        chineseTranslations.put("how do you say", "你怎么说");
        chineseTranslations.put("where is the restroom", "厕所在哪里？");
        chineseTranslations.put("I am hungry", "我饿了");
        chineseTranslations.put("how much does it cost", "多少钱？");
        chineseTranslations.put("can you help me", "你能帮我吗？");
        chineseTranslations.put("I love you", "我爱你");
        // Add more Chinese translations here...

        // English to Urdu translations
        Map<String, String> urduTranslations = new HashMap<>();
        urduTranslations.put("hello", "السلام علیکم");
        urduTranslations.put("how are you", "آپ کیسے ہیں؟");
        urduTranslations.put("good morning", "صبح بخیر");
        urduTranslations.put("thank you", "شکریہ");
        urduTranslations.put("goodbye", "خدا حافظ");
        urduTranslations.put("what is your name", "آپ کا نام کیا ہے؟");
        urduTranslations.put("where are you from", "آپ کہاں سے ہیں؟");
        urduTranslations.put("how old are you", "آپ کتنے سال کے ہیں؟");
        urduTranslations.put("what time is it", "ساعت کیا ہوا ہے؟");
        urduTranslations.put("how do you say", "آپ کے مطابق کیسے کہیں");
        urduTranslations.put("where is the restroom", "باتھ روم کہاں ہے؟");
        urduTranslations.put("I am hungry", "مجھے بھوک لگی ہے");
        urduTranslations.put("how much does it cost", "یہ کتنا مہنگا ہے؟");
        urduTranslations.put("can you help me", "کیا آپ میری مدد کر سکتے ہیں؟");
        urduTranslations.put("I love you", "میں تم سے محبت کرتا/کرتی ہوں");
        // Add more Urdu translations here...

        translationDictionary.put("german", germanTranslations);
        translationDictionary.put("turkish", turkishTranslations);
        translationDictionary.put("arabic", arabicTranslations);
        translationDictionary.put("chinese", chineseTranslations);
        translationDictionary.put("urdu", urduTranslations);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Language Translator Chatbot!");

        // Chat loop
        while (true) {
            System.out.println("Enter the text you want to translate:");

            // Get user input
            String userInput = scanner.nextLine();

            // Prompt user to select target language
            System.out.println("Select the target language:");
            System.out.println("1. German");
            System.out.println("2. Turkish");
            System.out.println("3. Arabic");
            System.out.println("4. Chinese");
            System.out.println("5. Urdu");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Translate text
            String translatedText = translateText(userInput, choice);

            // Display translated text
            System.out.println("Translated Text: " + translatedText);

            // Ask user if they want to translate more
            System.out.println("Do you want to translate more? (yes/no)");
            String more = scanner.nextLine();
            if (!more.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using the Language Translator Chatbot!");
                break;
            }
        }

        scanner.close();
    }

    private static String translateText(String textToTranslate, int choice) {
        String language;
        switch (choice) {
            case 1:
                language = "german";
                break;
            case 2:
                language = "turkish";
                break;
            case 3:
                language = "arabic";
                break;
            case 4:
                language = "chinese";
                break;
            case 5:
                language = "urdu";
                break;
            default:
                return "Invalid choice";
        }

        Map<String, String> translations = translationDictionary.get(language.toLowerCase());
        if (translations != null && translations.containsKey(textToTranslate.toLowerCase())) {
            return translations.get(textToTranslate.toLowerCase());
        } else {
            return "Translation not found";
        }
    }
}