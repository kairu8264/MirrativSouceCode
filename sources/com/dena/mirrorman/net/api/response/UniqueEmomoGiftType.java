package com.dena.mirrorman.net.api.response;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum UniqueEmomoGiftType {
    NONE(0),
    STAMP_GIFT(1),
    RICH_GIFT(2);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final UniqueEmomoGiftType fromInt(int i10) {
            UniqueEmomoGiftType uniqueEmomoGiftType;
            UniqueEmomoGiftType[] values = UniqueEmomoGiftType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    uniqueEmomoGiftType = null;
                    break;
                }
                uniqueEmomoGiftType = values[i11];
                if (uniqueEmomoGiftType.getValue() == i10) {
                    break;
                }
                i11++;
            }
            return uniqueEmomoGiftType == null ? UniqueEmomoGiftType.NONE : uniqueEmomoGiftType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<UniqueEmomoGiftType> {
        public static final int $stable = 0;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public UniqueEmomoGiftType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return UniqueEmomoGiftType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, UniqueEmomoGiftType uniqueEmomoGiftType) {
            p.h(jsonWriter, "writer");
            p.h(uniqueEmomoGiftType, "value");
            jsonWriter.value(Integer.valueOf(uniqueEmomoGiftType.getValue()));
        }
    }

    UniqueEmomoGiftType(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
