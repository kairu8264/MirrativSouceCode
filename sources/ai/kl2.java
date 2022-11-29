package ai;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class kl2 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f6276a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6277b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6278c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6279d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6280e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6281f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6282g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6283h;

    /* renamed from: i  reason: collision with root package name */
    public final jl2 f6284i;

    public kl2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        int i10 = 0;
        String str = "";
        long j10 = 0;
        jl2 jl2Var = null;
        int i11 = 0;
        boolean z10 = false;
        String str2 = str;
        String str3 = str2;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = yg.y0.b(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j10 = jsonReader.nextLong();
            } else {
                if (((Boolean) ft.c().c(ox.V5)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    jl2Var = new jl2(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.f6276a = emptyList;
        this.f6278c = i10;
        this.f6277b = str2;
        this.f6279d = str3;
        this.f6280e = i11;
        this.f6281f = j10;
        this.f6284i = jl2Var;
        this.f6282g = z10;
        this.f6283h = str;
    }
}
