package day8.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 14-4-27.
 */
public class RegExpTest {
    private static final String ARTICLE = "Why do some people like programming?\n" +
            "By Marcus Geduld, 30 years of coding.\n" +
            "\n" +
            "- I like creating something out of nothing. That's not literally what you do when you're programming, because there's existing hardware and software that serves as a foundation for your work, but it sure feels that way. Someone has an idea and you build it from the ground up. When you begin, there's just an empty text editor. When you're done, there's a (hopefully) working program.\n" +
            "\n" +
            "- I like building things people use. It's amazing to type up some code, press a button, and suddenly thousands of people on the Internet are playing with it.\n" +
            "\n" +
            "- I like playing God. Programming allows you to build little worlds and then play with them, making adjustments and watching the effects. It's like owning a toy planet and saying, \"I'm going to make it rain, today. Oh, look! All the little people have opened umbrellas!\" This playing-God aspect of programming makes it similar to writing novels, painting paintings, or directing plays. \n" +
            "\n" +
            "- I like working within systems that demand precision. This is exactly what some people hate about programming, but it thrills me. A misplaced semicolon or the smallest typo can be disastrous. This keeps me on my toes. It's like being the butler on \"Downton Abbey\" or \"Upstairs, Downstairs.\" Everything must be just so. Some people like precision; others like being about to say, \"I can't describe it, but you know what I mean...\" I'm the former type.\n" +
            "\n" +
            "- I like solving puzzles. If you want to see if programming is for you, try out this puzzle book: The Little Schemer - 4th Edition: Daniel P. Friedman, Matthias Felleisen, Duane Bibby, Gerald J. Sussman: 9780262560993: Amazon.com: Books\n" +
            "\n" +
            "- I like research. Programming tends to involve much googling and reading through documentation. \n" +
            "\n" +
            "- I like experimenting. There's a large component of trial-and-error.\n" +
            "\n" +
            "- I like writing poetry, which is very similar to programming. Both the poet and the programmer are obsessed with words, obsessed with formal rules, obsessed with seeing how far they can push those rules, and obsessed with expressiveness. Programmers often talk about how expressive a particular programming language is. They mean something very similar to what a poet means when he tries to come up with expressive wording.\n" +
            "\n" +
            "Both poetry and code can be exquisitely beautiful -- and in very similar ways. People are often surprised that I'm a programmer who also directs Shakespeare plays, but I've met lots of programmers who are into Shakespeare, crossword puzzles, scrabble, and so on. Joshua Engel is another Quora user who writes code and directs Shakespeare plays. \n" +
            "\n" +
            "- I like communicating. Most good programmers will tell you that code is first-and-foremost meant to be read by people -- even to the extent that we'll sometimes write it in a way that is inefficient but easy-to-read. \n" +
            "\n" +
            "- \"There are only two hard things in Computer Science: cache invalidation and naming things.\" -- Phil Karlton. I love the hard work of \"naming things.\" Programmers generally have to come up with short words or phrases that label parts of the systems they're writing. It's crucial that these names be clear and apt. \n" +
            "\n" +
            "Why? Because if you name something cButton, the next guy who has to work on your code may be befuddled. If you'd called it closeButton, he would have instantly known what you were referring to. Sometimes \"he\" is me a few weeks (or a year) later, when I'm reading my own code. It's embarrassing to come across cButton and think, \"What did I mean by that?\"\n" +
            "\n" +
            "Last week, I was modifying someone else's code. It was for as web page with sections. Each section had a logo at the top. The original programmer had referred to those logos internally as \"headers,\" e.g. \"header1\" and \"header2.\" I didn't notice that, and so I named something within one of the sections \"header.\" When I later looked over the code, I got totally confused between his headers and mine. \n" +
            "\n" +
            "Then I thought it over and realized that his \"headers\" were always graphical logos and mine were text. So I renamed his \"logo1\" and \"logo2\" and mine \"title.\" \n" +
            "\n" +
            "This is just one small example of the sort of naming issues that constantly crop up. You either enjoy this sort of thing or you don't. I do.\n" +
            "\n" +
            "- I like learning. Like sharks, programmers die if they stop moving. Because technology changes so fast, being a programmer means that \"school\" never stops. Even though I've been coding for years, I must constantly read programming books, follow blogs, and so on. There's no coasting! \n" +
            "\n" +
            "I got into the game as a Flash programmer, which was lucrative for about ten years. Now Flash seems to be on its way out, so it's back to the books! But even while I was mostly coding Actionscript (Flash's language), I needed constant training, because that language went through many versions, some as different from each other as Spanish is from Portuguese. \n" +
            "\n" +
            "There are many good programming books and courses, but you can't really learn to code by instruction. That will get you started, but they only real way to learn is to write code, fail, analyse the failure, and learn from it. So you must enjoy being an autodidact. I do.\n" +
            "\n" +
            "- I like being a detective. Maybe 60% of programming is debugging -- figuring out how something works. That often means a ton of sleuth work. Sometimes you have to pick and entire program apart and put it back together again. \n" +
            "\n" +
            "- I like solitary work. Programming allows me to do lots of that.\n" +
            "\n" +
            "- I like collaborating. Nowadays, Few programmers work completely alone. Most are part of a team, and they spend part of the week doing close work with others and part in isolation. I feel a strong need for both sorts of work, and I like alternating between the two.\n";

    private static final String WORD = "\\bprogram[A-z]*";

    private static int counter;

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(WORD, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(ARTICLE);
//        System.out.println(matcher.matches());
        while (matcher.find()) {
            System.out.println(matcher.group());
            counter++;
        }
        System.out.println(counter);

    }

}
