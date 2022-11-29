package com.dena.mirrativ.mirrativapi.user;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum SeasonRatingRankType {
    S(1),
    A2(2),
    A1(3),
    B4(4),
    B3(5),
    B2(6),
    B1(7),
    C2(8),
    C1(9),
    D2(10),
    D1(11),
    E(12);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final SeasonRatingRankType fromInt(int i10) {
            SeasonRatingRankType seasonRatingRankType;
            SeasonRatingRankType[] values = SeasonRatingRankType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    seasonRatingRankType = null;
                    break;
                }
                seasonRatingRankType = values[i11];
                if (seasonRatingRankType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return seasonRatingRankType == null ? SeasonRatingRankType.E : seasonRatingRankType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<SeasonRatingRankType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public SeasonRatingRankType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return SeasonRatingRankType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, SeasonRatingRankType seasonRatingRankType) {
            p.h(jsonWriter, "writer");
            p.h(seasonRatingRankType, "value");
            jsonWriter.value(Integer.valueOf(seasonRatingRankType.getRawValue()));
        }
    }

    SeasonRatingRankType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
