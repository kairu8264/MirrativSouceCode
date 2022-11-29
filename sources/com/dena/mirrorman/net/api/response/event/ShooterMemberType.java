package com.dena.mirrorman.net.api.response.event;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum ShooterMemberType {
    NONE(0),
    HOST(1),
    STREAMER(2),
    MEMBER(3),
    BOT(4);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ShooterMemberType fromInt(int i10) {
            ShooterMemberType shooterMemberType;
            ShooterMemberType[] values = ShooterMemberType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    shooterMemberType = null;
                    break;
                }
                shooterMemberType = values[i11];
                if (shooterMemberType.getValue() == i10) {
                    break;
                }
                i11++;
            }
            return shooterMemberType == null ? ShooterMemberType.NONE : shooterMemberType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<ShooterMemberType> {
        public static final int $stable = 0;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public ShooterMemberType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return ShooterMemberType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, ShooterMemberType shooterMemberType) {
            p.h(jsonWriter, "writer");
            p.h(shooterMemberType, "value");
            jsonWriter.value(Integer.valueOf(shooterMemberType.getValue()));
        }
    }

    ShooterMemberType(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
