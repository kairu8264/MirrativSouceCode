package com.dena.mirrativ.mirrativapi.core;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class BooleanTypeAdapter extends t<Boolean> {
    @Override // xm.t
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Boolean bool) {
        write(jsonWriter, bool.booleanValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public Boolean read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return Boolean.valueOf(jsonReader.nextInt() == 1);
    }

    public void write(JsonWriter jsonWriter, boolean z10) {
        p.h(jsonWriter, "writer");
        jsonWriter.value(z10 ? 1L : 0L);
    }
}
