import util.BigfootUtils;

public class ServerNameGenerator {

    private static String[] adjectives = {"Alderaanian", "arrogant", "astromech", "battle-worn", "bitter", "brave", "calculating", "charismatic", "chatty", "cold-blooded", "courageous", "crimson", "crusty", "cunning", "dark", "decisive", "defiant", "dependable", "devious", "dexterous", "determined", "diplomatic", "dismantled", "elite", "exotic", "fearless", "fiery", "flamboyant", "frenzied", "friendly", "frozen", "gargantuan", "glowing", "graceful", "grizzled", "harsh", "heroic", "hulking", "icy", "imperial", "impulsive", "infamous", "insane", "intelligent", "ironclad", "jaded", "jovial", "jubilant", "judicious", "keen", "klutzy", "lethal", "logical", "loyal", "lucrative", "luminous", "mad", "malevolent",  "martial", "mechanical", "merciless", "mysterious", "noble", "ominous", "ornery", "outlaw", "outrageous", "passionate", "peaceful", "peculiar", "pragmatic", "prickly", "proud", "pugnacious", "quick-witted", "rakish", "rampaging", "rebellious", "resilient", "restless", "resourceful", "roaring", "rowdy", "rugged", "savage", "scorched", "scoundrel", "scruffy", "seething", "sinister", "sleek", "slimy", "sly", "smuggler", "snarky", "spectral", "steely", "stoic", "stormtrooper", "strategic", "strong-willed", "sullen", "svelte", "swaggering", "swift", "sympathetic", "tactical", "tenacious", "tormented", "troubled", "uncivilized", "unconventional", "unflappable", "unforgiving", "unpredictable", "untamed", "vengeful", "vicious", "vile", "vindictive", "voracious", "wily", "wounded", "xenophobic", "youthful", "zealous"};


    private static String[] nouns = {"armour", "blossom", "blush", "bower", "brave", "breath", "bribe", "brooch", "bruise", "buckle", "bustle", "carrion", "casket", "caution", "censure", "ceremony", "chariot", "citizen", "cloak", "cobble", "coil", "collar", "column", "conceit", "confusion", "conspirator", "constancy", "corse", "coward", "crown", "crutch", "curse", "danger", "desire", "device", "dignity", "dirge", "discourse", "disease", "disgrace", "disrobe", "dog", "dread", "ducat", "dust", "eagle", "enchantment", "enterprise", "envy", "error", "fear", "feeble", "festival", "fiery", "firmament", "flatterer", "flint", "flourish", "foe", "foot", "fortune", "frown", "funeral", "fury", "gait", "garland", "ghost", "glove", "grief", "grudge", "havoc", "hedge", "heir", "hideous", "holiness", "holy", "honour", "horn", "hound", "hue", "hunger", "hydra", "idol", "indignation", "injury", "innocence", "iron", "ivy", "jest", "jewel", "justice", "kerchief", "knot", "lament", "laurel", "law", "leisure", "life", "light", "lion", "love", "loyalty", "majesty", "malice", "manner", "marble"};


    public static String randomElement(String[] stringArray){
        int index = BigfootUtils.getRandomInt(0, stringArray.length-1);
        return stringArray[index];
    }

    public static void main(String[] args) {
        String noun = randomElement(nouns);
        String adj = randomElement(adjectives);
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", adj, noun);
    }

}

