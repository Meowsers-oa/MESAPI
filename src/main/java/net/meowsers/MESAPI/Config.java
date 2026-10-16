package net.meowsers.MESAPI;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class Config {
    private static final ModConfigSpec.Builder BUILDER=new ModConfigSpec.Builder();
    public static final ModConfigSpec.BooleanValue SHOW_EXAMPLES=BUILDER
        .comment("Show MESAPI example machines and cables in the Functional Blocks creative tab. Registry IDs remain available.")
        .define("showExamples",true);
    public static final ModConfigSpec SPEC=BUILDER.build();
    private Config() {}
}
