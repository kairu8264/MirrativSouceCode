package ai;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes3.dex */
public final class aq1 {

    /* renamed from: a  reason: collision with root package name */
    public final vh.f f1974a;

    public aq1(vh.f fVar) {
        this.f1974a = fVar;
    }

    public final void a(List<Object> list, String str, String str2, Object... objArr) {
        if (fz.f4253a.e().booleanValue()) {
            long currentTimeMillis = this.f1974a.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(currentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj2 = objArr[i10];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e10) {
                uj0.d("unable to log", e10);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            uj0.e(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
