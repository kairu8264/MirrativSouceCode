package com.dena.mirrativ.mirrativapi.user;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum YellRankType {
    NONE(0),
    CHEER_ROOKIE1(1),
    CHEER_ROOKIE2(2),
    CHEER_LEADER1(3),
    CHEER_LEADER2(4),
    CHEER_LEADER3(5),
    CHEER_LEADER4(6),
    CHEER_LEADER_GOLD(7),
    CHEER_LEADER_PLATINUM(8),
    CHEER_LEADER_DIAMOND(9),
    CHEER_LEGEND(10);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final YellRankType fromInt(int i10) {
            YellRankType yellRankType;
            YellRankType[] values = YellRankType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    yellRankType = null;
                    break;
                }
                yellRankType = values[i11];
                if (yellRankType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return yellRankType == null ? YellRankType.NONE : yellRankType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<YellRankType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public YellRankType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return YellRankType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, YellRankType yellRankType) {
            p.h(jsonWriter, "writer");
            p.h(yellRankType, "value");
            jsonWriter.value(Integer.valueOf(yellRankType.getRawValue()));
        }
    }

    YellRankType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
