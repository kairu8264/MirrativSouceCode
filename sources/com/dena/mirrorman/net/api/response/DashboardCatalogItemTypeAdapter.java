package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.net.api.response.DashboardCatalogItemType;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class DashboardCatalogItemTypeAdapter extends t<DashboardCatalogItemType> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public DashboardCatalogItemType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        DashboardCatalogItemType.Companion companion = DashboardCatalogItemType.Companion;
        String nextString = jsonReader.nextString();
        p.g(nextString, "reader.nextString()");
        return companion.fromTypeName(nextString);
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, DashboardCatalogItemType dashboardCatalogItemType) {
        p.h(jsonWriter, "writer");
        p.h(dashboardCatalogItemType, "value");
        jsonWriter.value(dashboardCatalogItemType.getTypeName());
    }
}
