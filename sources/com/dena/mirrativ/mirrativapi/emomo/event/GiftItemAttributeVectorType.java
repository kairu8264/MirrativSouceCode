package com.dena.mirrativ.mirrativapi.emomo.event;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum GiftItemAttributeVectorType {
    UNKNOWN(0),
    POSITIVE(1),
    NEGATIVE(2),
    NEUTRAL(3);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final GiftItemAttributeVectorType fromInt(int i10) {
            GiftItemAttributeVectorType giftItemAttributeVectorType;
            GiftItemAttributeVectorType[] values = GiftItemAttributeVectorType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    giftItemAttributeVectorType = null;
                    break;
                }
                giftItemAttributeVectorType = values[i11];
                if (giftItemAttributeVectorType.getValue() == i10) {
                    break;
                }
                i11++;
            }
            return giftItemAttributeVectorType == null ? GiftItemAttributeVectorType.UNKNOWN : giftItemAttributeVectorType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<GiftItemAttributeVectorType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public GiftItemAttributeVectorType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return GiftItemAttributeVectorType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, GiftItemAttributeVectorType giftItemAttributeVectorType) {
            p.h(jsonWriter, "writer");
            p.h(giftItemAttributeVectorType, "value");
            jsonWriter.value(Integer.valueOf(giftItemAttributeVectorType.getValue()));
        }
    }

    GiftItemAttributeVectorType(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
