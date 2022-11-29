package ai;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.FileTypes;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes3.dex */
public class z44 extends w34<String> {
    public final Object I;
    public final b44<String> J;

    public z44(int i10, String str, b44<String> b44Var, a44 a44Var) {
        super(i10, str, a44Var);
        this.I = new Object();
        this.J = b44Var;
    }

    public void F(String str) {
        b44<String> b44Var;
        synchronized (this.I) {
            b44Var = this.J;
        }
        b44Var.a(str);
    }

    @Override // ai.w34
    public final c44<String> y(s34 s34Var) {
        String str;
        String str2;
        try {
            byte[] bArr = s34Var.f9705b;
            Map<String, String> map = s34Var.f9706c;
            String str3 = C.ISO88591_NAME;
            if (map != null && (str2 = map.get(FileTypes.HEADER_CONTENT_TYPE)) != null) {
                String[] split = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i10].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(s34Var.f9705b);
        }
        return c44.a(str, q44.a(s34Var));
    }
}
