package xp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class a implements b, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final List<zp.a<String, Object>> f60634w = new ArrayList();

    @Override // xp.b
    public String a(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(256);
        if (str != null) {
            sb2.append(str);
        }
        if (this.f60634w.size() > 0) {
            if (sb2.length() > 0) {
                sb2.append('\n');
            }
            sb2.append("Exception Context:\n");
            int i10 = 0;
            for (zp.a<String, Object> aVar : this.f60634w) {
                sb2.append("\t[");
                i10++;
                sb2.append(i10);
                sb2.append(':');
                sb2.append(aVar.getKey());
                sb2.append("=");
                Object value = aVar.getValue();
                if (value == null) {
                    sb2.append("null");
                } else {
                    try {
                        str2 = value.toString();
                    } catch (Exception e10) {
                        str2 = "Exception thrown on toString(): " + c.a(e10);
                    }
                    sb2.append(str2);
                }
                sb2.append("]\n");
            }
            sb2.append("---------------------------------");
        }
        return sb2.toString();
    }
}
