package com.dena.mirrorman.net.api.response;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class MissionStatusTypeAdapter extends t<MissionStatus> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public MissionStatus read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return MissionStatus.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, MissionStatus missionStatus) {
        p.h(jsonWriter, "writer");
        p.h(missionStatus, "value");
        jsonWriter.value(Integer.valueOf(missionStatus.getRawValue()));
    }
}
