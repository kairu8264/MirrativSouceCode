package com.dena.mirrorman.net.api.response.event;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum ShooterGroupStatus {
    NONE(0),
    LAUNCHING(1),
    PLAYING(2),
    FINISHED(3);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ShooterGroupStatus fromInt(Integer num) {
            ShooterGroupStatus shooterGroupStatus;
            ShooterGroupStatus[] values = ShooterGroupStatus.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    shooterGroupStatus = null;
                    break;
                }
                shooterGroupStatus = values[i10];
                if (num != null && shooterGroupStatus.getValue() == num.intValue()) {
                    break;
                }
                i10++;
            }
            return shooterGroupStatus == null ? ShooterGroupStatus.NONE : shooterGroupStatus;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<ShooterGroupStatus> {
        public static final int $stable = 0;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public ShooterGroupStatus read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return ShooterGroupStatus.Companion.fromInt(Integer.valueOf(jsonReader.nextInt()));
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, ShooterGroupStatus shooterGroupStatus) {
            p.h(jsonWriter, "writer");
            p.h(shooterGroupStatus, "value");
            jsonWriter.value(Integer.valueOf(shooterGroupStatus.getValue()));
        }
    }

    ShooterGroupStatus(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
