package ai;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class il2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5280a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5281b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5282c;

    public il2(int i10, int i11, boolean z10) {
        this.f5280a = i10;
        this.f5281b = i11;
        this.f5282c = z10;
    }

    public static List<il2> a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i10 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i11 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z10 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new il2(i10, i11, z10));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
