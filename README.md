# Bracket Validator

Bu program, verilen bir karakter dizisinin içindeki parantezlerin doğru eşleşip eşleşmediğini kontrol eder. Özellikle açma ve kapanma parantezleri (`()`, `{}`, `[]`) arasındaki uyumsuzlukları tespit eder.

## Nasıl Çalışır?

`isValid` metodunun çalışma mantığı şu adımlardan oluşur:

1. Bir karakter dizisi üzerinde döngü ile her karakter kontrol edilir.
2. Açma parantezleri (`(`, `{`, `[`) bulunduğunda, bunlar bir yığına (`Stack`) eklenir.
3. Kapanma parantezleri (`)`, `}`, `]`) bulunduğunda, yığından en üstteki eleman çıkarılır ve uyum kontrolü yapılır.
4. Uyumsuzluk durumunda, program false döner ve işlem sona erer.
5. Tüm karakterler kontrol edildikten sonra, yığın boş değilse veya uyumsuzluk tespit edilirse program false döner, aksi takdirde true döner.

## Kullanım

Proje içerisinde `IsValidBrackets` sınıfı, verilen bir karakter dizisini kontrol etmek için `isValid` metodunu sağlar.

```java
public class Main {
    public static void main(String[] args) {
        String input = "([]{()})";
        boolean result = IsValidBrackets.isValid(input);
        System.out.println(result ? "Valid" : "Invalid");
    }
}