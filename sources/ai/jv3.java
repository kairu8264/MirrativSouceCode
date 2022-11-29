package ai;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes3.dex */
public final class jv3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5939a;

    public jv3(int i10, int i11, String str) {
        this.f5939a = str;
    }

    public static jv3 a(hb hbVar) {
        String str;
        hbVar.s(2);
        int v10 = hbVar.v();
        int i10 = v10 >> 1;
        int v11 = (hbVar.v() >> 3) | ((v10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = v11 < 10 ? ".0" : TopicConstant.SEPARATOR;
        StringBuilder sb2 = new StringBuilder(str.length() + 24 + str2.length());
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(v11);
        return new jv3(i10, v11, sb2.toString());
    }
}
