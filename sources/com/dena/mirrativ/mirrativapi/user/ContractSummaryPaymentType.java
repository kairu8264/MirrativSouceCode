package com.dena.mirrativ.mirrativapi.user;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.h;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public enum ContractSummaryPaymentType {
    COIN(0),
    CASH(1);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ContractSummaryPaymentType fromInt(int i10) {
            ContractSummaryPaymentType contractSummaryPaymentType;
            ContractSummaryPaymentType[] values = ContractSummaryPaymentType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    contractSummaryPaymentType = null;
                    break;
                }
                contractSummaryPaymentType = values[i11];
                if (contractSummaryPaymentType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return contractSummaryPaymentType == null ? ContractSummaryPaymentType.COIN : contractSummaryPaymentType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TypeAdapter extends t<ContractSummaryPaymentType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public ContractSummaryPaymentType read(JsonReader jsonReader) {
            p.h(jsonReader, "reader");
            jsonReader.peek();
            return ContractSummaryPaymentType.Companion.fromInt(jsonReader.nextInt());
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, ContractSummaryPaymentType contractSummaryPaymentType) {
            p.h(jsonWriter, "writer");
            p.h(contractSummaryPaymentType, "value");
            jsonWriter.value(Integer.valueOf(contractSummaryPaymentType.getRawValue()));
        }
    }

    ContractSummaryPaymentType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
