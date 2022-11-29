package dl;

import android.util.Base64;
import android.util.JsonReader;
import cl.a0;
import cl.b0;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ql.a f29724a = new sl.d().j(cl.a.f19672a).k(true).i();

    /* loaded from: classes4.dex */
    public interface a<T> {
        T a(JsonReader jsonReader) throws IOException;
    }

    public static a0 A(JsonReader jsonReader) throws IOException {
        a0.b b10 = a0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b10.f(y(jsonReader));
                    break;
                case 1:
                    b10.h(jsonReader.nextString());
                    break;
                case 2:
                    b10.b(jsonReader.nextString());
                    break;
                case 3:
                    b10.d(jsonReader.nextString());
                    break;
                case 4:
                    b10.e(jsonReader.nextString());
                    break;
                case 5:
                    b10.g(jsonReader.nextInt());
                    break;
                case 6:
                    b10.c(jsonReader.nextString());
                    break;
                case 7:
                    b10.i(B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b10.a();
    }

    public static a0.e B(JsonReader jsonReader) throws IOException {
        a0.e.b a10 = a0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals(LogBase.OS)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals(MRLog.TARGET_TYPE_USER)) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c10 = '\n';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.l(jsonReader.nextLong());
                    break;
                case 1:
                    a10.j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a10.e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a10.d(m(jsonReader));
                    break;
                case 4:
                    a10.f(k(jsonReader, dl.a.f29718a));
                    break;
                case 5:
                    a10.k(z(jsonReader));
                    break;
                case 6:
                    a10.b(i(jsonReader));
                    break;
                case 7:
                    a10.m(C(jsonReader));
                    break;
                case '\b':
                    a10.g(jsonReader.nextString());
                    break;
                case '\t':
                    a10.c(jsonReader.nextBoolean());
                    break;
                case '\n':
                    a10.h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.f C(JsonReader jsonReader) throws IOException {
        a0.e.f.a a10 = a0.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a10.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.a i(JsonReader jsonReader) throws IOException {
        a0.e.a.AbstractC0159a a10 = a0.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.e(jsonReader.nextString());
                    break;
                case 1:
                    a10.b(jsonReader.nextString());
                    break;
                case 2:
                    a10.c(jsonReader.nextString());
                    break;
                case 3:
                    a10.g(jsonReader.nextString());
                    break;
                case 4:
                    a10.f(jsonReader.nextString());
                    break;
                case 5:
                    a10.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.a j(JsonReader jsonReader) throws IOException {
        a0.a.AbstractC0158a a10 = a0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(jsonReader.nextInt());
                    break;
                case 1:
                    a10.e(jsonReader.nextLong());
                    break;
                case 2:
                    a10.g(jsonReader.nextLong());
                    break;
                case 3:
                    a10.h(jsonReader.nextLong());
                    break;
                case 4:
                    a10.d(jsonReader.nextString());
                    break;
                case 5:
                    a10.f(jsonReader.nextInt());
                    break;
                case 6:
                    a10.i(jsonReader.nextString());
                    break;
                case 7:
                    a10.b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static <T> b0<T> k(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return b0.d(arrayList);
    }

    public static a0.c l(JsonReader jsonReader) throws IOException {
        a0.c.a a10 = a0.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a10.b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a10.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.c m(JsonReader jsonReader) throws IOException {
        a0.e.c.a a10 = a0.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a10.e(jsonReader.nextString());
                    break;
                case 2:
                    a10.h(jsonReader.nextLong());
                    break;
                case 3:
                    a10.b(jsonReader.nextInt());
                    break;
                case 4:
                    a10.d(jsonReader.nextLong());
                    break;
                case 5:
                    a10.c(jsonReader.nextInt());
                    break;
                case 6:
                    a10.f(jsonReader.nextString());
                    break;
                case 7:
                    a10.j(jsonReader.nextInt());
                    break;
                case '\b':
                    a10.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d n(JsonReader jsonReader) throws IOException {
        a0.e.d.b a10 = a0.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(q(jsonReader));
                    break;
                case 1:
                    a10.b(o(jsonReader));
                    break;
                case 2:
                    a10.d(u(jsonReader));
                    break;
                case 3:
                    a10.f(jsonReader.nextString());
                    break;
                case 4:
                    a10.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d.a o(JsonReader jsonReader) throws IOException {
        a0.e.d.a.AbstractC0160a a10 = a0.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a10.d(r(jsonReader));
                    break;
                case 2:
                    a10.e(k(jsonReader, f.f29723a));
                    break;
                case 3:
                    a10.c(k(jsonReader, f.f29723a));
                    break;
                case 4:
                    a10.f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d.a.b.AbstractC0161a p(JsonReader jsonReader) throws IOException {
        a0.e.d.a.b.AbstractC0161a.AbstractC0162a a10 = a0.e.d.a.b.AbstractC0161a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(jsonReader.nextString());
                    break;
                case 1:
                    a10.d(jsonReader.nextLong());
                    break;
                case 2:
                    a10.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a10.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d.c q(JsonReader jsonReader) throws IOException {
        a0.e.d.c.a a10 = a0.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a10.c(jsonReader.nextInt());
                    break;
                case 2:
                    a10.e(jsonReader.nextInt());
                    break;
                case 3:
                    a10.d(jsonReader.nextLong());
                    break;
                case 4:
                    a10.g(jsonReader.nextLong());
                    break;
                case 5:
                    a10.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d.a.b r(JsonReader jsonReader) throws IOException {
        a0.e.d.a.b.AbstractC0163b a10 = a0.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(j(jsonReader));
                    break;
                case 1:
                    a10.f(k(jsonReader, c.f29720a));
                    break;
                case 2:
                    a10.e(v(jsonReader));
                    break;
                case 3:
                    a10.c(k(jsonReader, e.f29722a));
                    break;
                case 4:
                    a10.d(s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d.a.b.c s(JsonReader jsonReader) throws IOException {
        a0.e.d.a.b.c.AbstractC0164a a10 = a0.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(k(jsonReader, b.f29719a));
                    break;
                case 1:
                    a10.e(jsonReader.nextString());
                    break;
                case 2:
                    a10.f(jsonReader.nextString());
                    break;
                case 3:
                    a10.b(s(jsonReader));
                    break;
                case 4:
                    a10.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d.a.b.AbstractC0167e.AbstractC0169b t(JsonReader jsonReader) throws IOException {
        a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a a10 = a0.e.d.a.b.AbstractC0167e.AbstractC0169b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.d(jsonReader.nextLong());
                    break;
                case 1:
                    a10.f(jsonReader.nextString());
                    break;
                case 2:
                    a10.e(jsonReader.nextLong());
                    break;
                case 3:
                    a10.b(jsonReader.nextString());
                    break;
                case 4:
                    a10.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d.AbstractC0171d u(JsonReader jsonReader) throws IOException {
        a0.e.d.AbstractC0171d.a a10 = a0.e.d.AbstractC0171d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a10.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d.a.b.AbstractC0165d v(JsonReader jsonReader) throws IOException {
        a0.e.d.a.b.AbstractC0165d.AbstractC0166a a10 = a0.e.d.a.b.AbstractC0165d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(jsonReader.nextLong());
                    break;
                case 1:
                    a10.c(jsonReader.nextString());
                    break;
                case 2:
                    a10.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.d.a.b.AbstractC0167e w(JsonReader jsonReader) throws IOException {
        a0.e.d.a.b.AbstractC0167e.AbstractC0168a a10 = a0.e.d.a.b.AbstractC0167e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(k(jsonReader, b.f29719a));
                    break;
                case 1:
                    a10.d(jsonReader.nextString());
                    break;
                case 2:
                    a10.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.d.b x(JsonReader jsonReader) throws IOException {
        a0.d.b.a a10 = a0.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a10.c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a10.b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.d y(JsonReader jsonReader) throws IOException {
        a0.d.a a10 = a0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a10.b(k(jsonReader, d.f29721a));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a10.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static a0.e.AbstractC0172e z(JsonReader jsonReader) throws IOException {
        a0.e.AbstractC0172e.a a10 = a0.e.AbstractC0172e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(jsonReader.nextString());
                    break;
                case 1:
                    a10.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a10.e(jsonReader.nextString());
                    break;
                case 3:
                    a10.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public a0 D(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a0 A = A(jsonReader);
            jsonReader.close();
            return A;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String E(a0 a0Var) {
        return f29724a.b(a0Var);
    }

    public a0.e.d g(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a0.e.d n10 = n(jsonReader);
            jsonReader.close();
            return n10;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String h(a0.e.d dVar) {
        return f29724a.b(dVar);
    }
}
