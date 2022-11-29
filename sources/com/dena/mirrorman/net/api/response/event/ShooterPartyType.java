package com.dena.mirrorman.net.api.response.event;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.NoSuchElementException;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum ShooterPartyType {
    MYSELF(1),
    PARTY(2),
    OTHER(3);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ShooterPartyType fromInt(int i10) {
            ShooterPartyType[] values;
            for (ShooterPartyType shooterPartyType : ShooterPartyType.values()) {
                if (shooterPartyType.getValue() == i10) {
                    return shooterPartyType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<ShooterPartyType> {
        public static final int $stable = 0;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public ShooterPartyType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return ShooterPartyType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, ShooterPartyType shooterPartyType) {
            p.h(jsonWriter, "writer");
            p.h(shooterPartyType, "value");
            jsonWriter.value(Integer.valueOf(shooterPartyType.getValue()));
        }
    }

    ShooterPartyType(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
