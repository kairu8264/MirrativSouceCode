package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonType;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class ToolTipStartLiveButtonTypeAdapter extends t<ToolTipStartLiveButtonType> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public ToolTipStartLiveButtonType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        ToolTipStartLiveButtonType.Companion companion = ToolTipStartLiveButtonType.Companion;
        String nextString = jsonReader.nextString();
        p.g(nextString, "reader.nextString()");
        return companion.fromString(nextString);
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, ToolTipStartLiveButtonType toolTipStartLiveButtonType) {
        p.h(jsonWriter, "writer");
        p.h(toolTipStartLiveButtonType, "value");
        jsonWriter.value(toolTipStartLiveButtonType.getTypeName());
    }
}
