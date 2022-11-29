package com.dena.mirrativ.mirrativapi.emomo.event;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;
import xn.s;

/* loaded from: classes2.dex */
public enum GiftItemEffectType {
    UNKNOWN(0),
    SHOOTER_COSTUME(1),
    SHOOTER_ITEM(2),
    SHOOTER_MACHINE(3),
    EMOMO_RUN(4),
    EMOMO_QUEST(5);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final GiftItemEffectType fromInt(int i10) {
            GiftItemEffectType giftItemEffectType;
            GiftItemEffectType[] values = GiftItemEffectType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    giftItemEffectType = null;
                    break;
                }
                giftItemEffectType = values[i11];
                if (giftItemEffectType.getValue() == i10) {
                    break;
                }
                i11++;
            }
            return giftItemEffectType == null ? GiftItemEffectType.UNKNOWN : giftItemEffectType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<GiftItemEffectType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public GiftItemEffectType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return GiftItemEffectType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, GiftItemEffectType giftItemEffectType) {
            p.h(jsonWriter, "writer");
            p.h(giftItemEffectType, "value");
            jsonWriter.value(Integer.valueOf(giftItemEffectType.getValue()));
        }
    }

    GiftItemEffectType(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isShooter() {
        return s.m(SHOOTER_COSTUME, SHOOTER_ITEM, SHOOTER_MACHINE).contains(this);
    }
}
