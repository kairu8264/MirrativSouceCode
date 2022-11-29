package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum EmomoQuestGameEffectType {
    POWER(1),
    SPEED(2),
    HIT_POINT(9),
    DECREASE_OBJECT_DAMAGE(10),
    DECREASE_ENEMY_DAMAGE(11),
    DECREASE_FALL_DAMAGE(12),
    JUMP(13),
    DECREASE_SPEED(14),
    EXTRA_HEAL_ITEM(15);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final EmomoQuestGameEffectType fromInt(int i10) {
            EmomoQuestGameEffectType emomoQuestGameEffectType;
            EmomoQuestGameEffectType[] values = EmomoQuestGameEffectType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    emomoQuestGameEffectType = null;
                    break;
                }
                emomoQuestGameEffectType = values[i11];
                if (emomoQuestGameEffectType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            if (emomoQuestGameEffectType != null) {
                return emomoQuestGameEffectType;
            }
            throw new IllegalArgumentException("unknown value: " + i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<EmomoQuestGameEffectType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public EmomoQuestGameEffectType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return EmomoQuestGameEffectType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, EmomoQuestGameEffectType emomoQuestGameEffectType) {
            p.h(jsonWriter, "writer");
            p.h(emomoQuestGameEffectType, "value");
            jsonWriter.value(Integer.valueOf(emomoQuestGameEffectType.getRawValue()));
        }
    }

    EmomoQuestGameEffectType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
