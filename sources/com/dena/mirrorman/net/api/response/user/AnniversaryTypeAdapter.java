package com.dena.mirrorman.net.api.response.user;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class AnniversaryTypeAdapter extends t<AnniversaryType> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public AnniversaryType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return AnniversaryType.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, AnniversaryType anniversaryType) {
        p.h(jsonWriter, "writer");
        p.h(anniversaryType, "value");
        jsonWriter.value(Integer.valueOf(anniversaryType.getRawValue()));
    }
}
