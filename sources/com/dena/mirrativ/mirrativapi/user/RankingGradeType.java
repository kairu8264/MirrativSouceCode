package com.dena.mirrativ.mirrativapi.user;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum RankingGradeType {
    DIAMOND(1),
    PLATINUM(2),
    EMERALD(3),
    GOLD(4),
    SILVER(5),
    NOT_RANK(0);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final RankingGradeType fromInt(int i10) {
            RankingGradeType rankingGradeType;
            RankingGradeType[] values = RankingGradeType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    rankingGradeType = null;
                    break;
                }
                rankingGradeType = values[i11];
                if (rankingGradeType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return rankingGradeType == null ? RankingGradeType.NOT_RANK : rankingGradeType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<RankingGradeType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public RankingGradeType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return RankingGradeType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, RankingGradeType rankingGradeType) {
            p.h(jsonWriter, "writer");
            p.h(rankingGradeType, "value");
            jsonWriter.value(Integer.valueOf(rankingGradeType.getRawValue()));
        }
    }

    RankingGradeType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
