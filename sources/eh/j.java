package eh;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f30596a;

    /* renamed from: b  reason: collision with root package name */
    public String f30597b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f30598c = new Bundle();

    public j(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        char c10;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (nextName.equals("params")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                str = jsonReader.nextString();
            } else if (c10 != 1) {
                jsonReader.skipValue();
            } else {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            }
        }
        this.f30596a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f30598c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
