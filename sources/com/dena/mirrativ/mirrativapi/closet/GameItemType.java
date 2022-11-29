package com.dena.mirrativ.mirrativapi.closet;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum GameItemType {
    None(0),
    EMOMO_RUN(1),
    SHOOTER_MACHINE(2),
    SHOOTER_ITEM(3),
    SHOOTER_GENERAL(4);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final GameItemType fromInt(int i10) {
            GameItemType gameItemType;
            GameItemType[] values = GameItemType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    gameItemType = null;
                    break;
                }
                gameItemType = values[i11];
                if (gameItemType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return gameItemType == null ? GameItemType.None : gameItemType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<GameItemType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public GameItemType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return GameItemType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, GameItemType gameItemType) {
            p.h(jsonWriter, "writer");
            p.h(gameItemType, "value");
            jsonWriter.value(Integer.valueOf(gameItemType.getRawValue()));
        }
    }

    GameItemType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }

    public final boolean isEmomoRun() {
        return this == EMOMO_RUN;
    }

    public final boolean isShooter() {
        return compareTo(SHOOTER_GENERAL) <= 0 && compareTo(SHOOTER_MACHINE) >= 0;
    }
}
