package com.dena.mirrorman.net.api.response;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class BroadcastResultEventTypeAdapter extends t<BroadcastResultEventType> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public BroadcastResultEventType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return BroadcastResultEventType.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, BroadcastResultEventType broadcastResultEventType) {
        p.h(jsonWriter, "writer");
        p.h(broadcastResultEventType, "value");
        jsonWriter.value(Integer.valueOf(broadcastResultEventType.getRawValue()));
    }
}
