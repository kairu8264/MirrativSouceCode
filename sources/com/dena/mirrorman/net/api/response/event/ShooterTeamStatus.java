package com.dena.mirrorman.net.api.response.event;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum ShooterTeamStatus {
    NONE(0),
    MATCHING(1),
    MATCHED(2),
    CANCELED(3),
    FORCE_MATCHING(4),
    LOCKED_MATCHING(5),
    LOCKED_FORCE_MATCHING(6),
    LOCKED_CANCELED(7),
    LAUNCHING(8),
    PLAYING(9),
    FINISHED(10);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ShooterTeamStatus fromInt(int i10) {
            ShooterTeamStatus shooterTeamStatus;
            ShooterTeamStatus[] values = ShooterTeamStatus.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    shooterTeamStatus = null;
                    break;
                }
                shooterTeamStatus = values[i11];
                if (shooterTeamStatus.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return shooterTeamStatus == null ? ShooterTeamStatus.NONE : shooterTeamStatus;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<ShooterTeamStatus> {
        public static final int $stable = 0;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public ShooterTeamStatus read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return ShooterTeamStatus.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, ShooterTeamStatus shooterTeamStatus) {
            p.h(jsonWriter, "writer");
            p.h(shooterTeamStatus, "value");
            jsonWriter.value(Integer.valueOf(shooterTeamStatus.getRawValue()));
        }
    }

    ShooterTeamStatus(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
