package com.dena.mirrorman.net.api.response;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class LiveArchiveStatusTypeAdapter extends t<LiveArchiveStatus> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public LiveArchiveStatus read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return LiveArchiveStatus.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, LiveArchiveStatus liveArchiveStatus) {
        p.h(jsonWriter, "writer");
        p.h(liveArchiveStatus, "value");
        jsonWriter.value(Integer.valueOf(liveArchiveStatus.getRawValue()));
    }
}
