package ai;

import android.util.JsonReader;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.IOException;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class jl2 {

    /* renamed from: a  reason: collision with root package name */
    public String f5839a;

    public jl2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        char c10;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c10 = 0;
                }
                c10 = 65535;
            } else {
                if (nextName.equals(MRLog.PAYLOAD_KEY_DESCRIPTION)) {
                    c10 = 1;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                jsonReader.nextInt();
            } else if (c10 != 1) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.f5839a = str;
    }

    public final String a() {
        return this.f5839a;
    }
}
