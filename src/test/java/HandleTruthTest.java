import org.junit.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String[] msgs = {
                null,
                "Can you imagine an imaginary menagerie manager imagining managing an imaginary menagerie.",
                "This is a ship-shipping ship shipping shipping-ships.",
                "Rose rose to put rose roes on her rows of roses.",
                "If it is it, it is it; if it is it is it, it is.",
                "That that exists exists in that that that that exists exists in.",
                "Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.\n" +
                        "\n" +
                        "Now we are engaged in a great civil war, testing whether that nation, or any nation so conceived and dedicated, can long endure. We are met on a great battle--field of that war. We have come to dedicate a portion of that field, as a final resting place for those who here gave their lives that that nation might live. It is altogether fitting and proper that we should do this.\n" +
                        "\n" +
                        "But, in a larger sense, we can not dedicate -- we can not consecrate -- we can not hallow -- this ground. The brave men, living and dead, who struggled here, have consecrated it, far above our poor power to add or detract. The world will little note, nor long remember what we say here, but it can never forget what they did here. It is for us the living, rather, to be dedicated here to the unfinished work which they who fought here have thus far so nobly advanced. It is rather for us to be here dedicated to the great task remaining before us -- that from these honored dead we take increased devotion to that cause for which they gave the last full measure of devotion -- that we here highly resolve that these dead shall not have died in vain -- that this nation, under God, shall have a new birth of freedom -- and that government of the people, by the people, for the people, shall not perish from the earth.",
                "To our good and loyal subjects:  After pondering deeply the general trends of the world and the actual conditions obtaining in our empire today, we have decided to effect a settlement of the present situation by resorting to an extraordinary measure.\n" +
                        "\n" +
                        "We have ordered our Government to communicate to the Governments of the United States, Great Britain, China and the Soviet Union that our empire accepts the provisions of their joint declaration.\n" +
                        "\n" +
                        "To strive for the common prosperity and happiness of all nations as well as the security and well-being of our subjects is the solemn obligation which has been handed down by our imperial ancestors and which we lay close to the heart.\n" +
                        "\n" +
                        "Indeed, we declared war on America and Britain out of our sincere desire to insure Japan's self-preservation and the stabilization of East Asia, it being far from our thought either to infringe upon the sovereignty of other nations or to embark upon territorial aggrandizement.\n" +
                        "\n" +
                        "But now the war has lasted for nearly four years.  Despite the best that has been done by everyone--the gallant fighting of our military and naval forces, the diligence and assiduity of out servants of the State and the devoted service of our 100,000,000 people--the war situation has developed not necessarily to Japan's advantage, while the general trends of the world have all turned against her interest.\n" +
                        "\n" +
                        "Moreover, the enemy has begun to employ a new and most cruel bomb, the power of which to do damage is, indeed, incalculable, taking the toll of many innocent lives.   Should we continue to fight, it would not only result in an ultimate collapse and obliteration of the Japanese nation, but also it would lead to the total extinction of human civilization.\n" +
                        "\n" +
                        "Such being the case, how are we to save the millions of our subjects, nor to atone ourselves before the hallowed spirits of our imperial ancestors?  This is the reason why we have ordered the acceptance of the provisions of the joint declaration of the powers.\n" +
                        "\n" +
                        "We cannot but express the deepest sense of regret to our allied nations of East Asia, who have consistently cooperated with the Empire toward the emancipation of East Asia.\n" +
                        "\n" +
                        "The thought of those officers and men as well as others who have fallen in the fields of battle, those who died at their posts of duty, or those who met death [otherwise] and all their bereaved families, pains our heart night and day.\n" +
                        "\n" +
                        "The welfare of the wounded and the war sufferers and of those who lost their homes and livelihood is the object of our profound solicitude.  The hardships and sufferings to which our nation is to be subjected hereafter will be certainly great.\n" +
                        "\n" +
                        "We are keenly aware of the inmost feelings of all of you, our subjects.  However, it is according to the dictates of time and fate that we have resolved to pave the way for a grand peace for all the generations to come by enduring the [unavoidable] and suffering what is unsufferable.  Having been able to save *** and maintain the structure of the Imperial State, we are always with you, our good and loyal subjects, relying upon your sincerity and integrity.\n" +
                        "\n" +
                        "Beware most strictly of any outbursts of emotion that may engender needless complications, of any fraternal contention and strife that may create confusion, lead you astray and cause you to lose the confidence of the world.\n" +
                        "\n" +
                        "Let the entire nation continue as one family from generation to generation, ever firm in its faith of the imperishableness of its divine land, and mindful of its heavy burden of responsibilities, and the long road before it.  Unite your total strength to be devoted to the construction for the future.  Cultivate the ways of rectitude, nobility of spirit, and work with resolution so that you may enhance the innate glory of the Imperial State and keep pace with the progress of the world.\n" +
                        "\n",
                "Good evening, everybody.\n" +
                        "\n" +
                        "Welcome to the White House Correspondents’ dinner. A night when Washington celebrates itself. Somebody’s got to do it. And welcome to the fourth quarter of my presidency. It’s true — that’s Michelle cheering.\n" +
                        "\n" +
                        "The fact is I feel more loose and relaxed than ever. Those Joe Biden shoulder massages — they’re like magic. You should try one. Oh, you have. I am determined to make the most of every moment I have left. After the midterm elections, my advisors asked me “Mr. President, do you have a bucket list?”  And I said, “Well, I have something that rhymes with bucket list.”\n" +
                        "\n" +
                        "Take executive action on immigration. Bucket.\n" +
                        "\n" +
                        "New climate regulations. Bucket. It’s the right thing to do.\n" +
                        "\n" +
                        "My new attitude is paying off. Look at my Cuba policy. The Castro brothers are here tonight. Welcome to America, amigos. Que pasa? What? It’s the Castros from Texas. Oh. Hi, Joaquin. Hi, Julian. Anyway, being president is never easy. I still have to fix a broken immigration system, issue veto threats, negotiate with Iran. All while finding time to pray five times a day. Which is strenuous.\n" +
                        "\n" +
                        "And it is no wonder that that people keep pointing out how the presidency has aged me. I look so old John Boehner’s already invited Benjamin Netanyahu to speak at my funeral.\n" +
                        "\n" +
                        "Meanwhile, Michelle hasn’t aged a day. I ask her what her secret is and she just says “fresh fruits and vegetables.” It’s aggravating.\n" +
                        "\n" +
                        "Fact is though, at this point my legacy is finally beginning to take shape. The economy is getting better. Nine in ten Americans now have health coverage. Today thanks to Obamacare you no longer have to worry about losing your insurance if you lose your job. You’re welcome, Senate democrats.\n " +
                        "\n" +
                        "Look, it is true I have not managed to make everybody happy. Six years into my presidency some people still say I’m arrogant, aloof, condescending. Some people are so dumb. No wonder I don’t meet with them. And that’s not all people say about me. A few weeks ago, Dick Cheney says he thinks I’m the worst president of his lifetime. Which is interesting because I think Dick Cheney is the worst president of my lifetime. Quite a coincidence. I mean everybody’s got something to say these days.\n" +
                        "\n" +
                        "Mike Huckabee recently said people shouldn’t join our military until a true conservative is elected president. Think about that. It was so outrageous 47 Ayatollahs wrote us a letter trying to explain to Huckabee how our system works.\n" +
                        "\n" +
                        "It gets worse. Just this week, Michele Bachmann actually predicted that I would bring about the biblical end of days. Now, that’s a legacy. That’s big. I mean, Lincoln, Washington, they didn’t do that.\n" +
                        "\n"
        };
        for (int i = 0; i < msgs.length; i++) {
            TreeMap<Integer, Set<String>> answer = HandleTruth.wordCount(msgs[i]);
            if (msgs[i] == null) {
                assertNull(answer);
            } else {
                Integer prev = Integer.MAX_VALUE;
                for (Map.Entry<Integer, Set<String>> entry : answer.entrySet()) {
                    assertTrue(entry.getKey() < prev);
                    prev = entry.getKey();
                    System.out.println(entry);
                    assertFalse(entry.getValue().contains(" "));
                    assertFalse(entry.getValue().contains("\\W"));
                    if (entry.getValue().contains("'")) {
                        int apostrophe = entry.getValue().toString().indexOf("'");
                        Character singleChar = entry.getValue().toString().charAt(apostrophe + 1);
                        assertFalse(singleChar.equals(' '));
                    }
                }
            }
            System.out.println("\n");
        }
    }
}