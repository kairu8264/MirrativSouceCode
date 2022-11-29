package com.dena.mirrorman.net.api.response.event;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;
import xn.s;

/* loaded from: classes2.dex */
public enum ShooterMemberStatus {
    NONE(0),
    INVITING(1),
    INVITED(2),
    APPROVED(3),
    REJECTED(4),
    CANCELING(5),
    CANCELED(6),
    CANCELED_BY_TIMEOUT(7),
    WAITING(8),
    LAUNCHING(9),
    PLAYING(10),
    FINISHED(11),
    RETIRED(12),
    BUSY(13);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ShooterMemberStatus fromInt(int i10) {
            ShooterMemberStatus shooterMemberStatus;
            ShooterMemberStatus[] values = ShooterMemberStatus.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    shooterMemberStatus = null;
                    break;
                }
                shooterMemberStatus = values[i11];
                if (shooterMemberStatus.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return shooterMemberStatus == null ? ShooterMemberStatus.NONE : shooterMemberStatus;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<ShooterMemberStatus> {
        public static final int $stable = 0;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public ShooterMemberStatus read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return ShooterMemberStatus.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, ShooterMemberStatus shooterMemberStatus) {
            p.h(jsonWriter, "writer");
            p.h(shooterMemberStatus, "value");
            jsonWriter.value(Integer.valueOf(shooterMemberStatus.getRawValue()));
        }
    }

    ShooterMemberStatus(int i10) {
        this.rawValue = i10;
    }

    public final boolean didInvite() {
        return s.m(INVITING, INVITED, APPROVED).contains(this);
    }

    public final int getRawValue() {
        return this.rawValue;
    }

    public final boolean isInvitable() {
        return s.m(NONE, REJECTED, CANCELING, CANCELED, CANCELED_BY_TIMEOUT, BUSY).contains(this);
    }
}
