package g5;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b  reason: collision with root package name */
    public View f32778b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f32777a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<m> f32779c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f32778b == sVar.f32778b && this.f32777a.equals(sVar.f32777a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f32778b.hashCode() * 31) + this.f32777a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f32778b + "\n") + "    values:";
        for (String str2 : this.f32777a.keySet()) {
            str = str + "    " + str2 + ": " + this.f32777a.get(str2) + "\n";
        }
        return str;
    }

    public s(View view) {
        this.f32778b = view;
    }
}
