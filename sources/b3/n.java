package b3;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f16889a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f16890b;

    /* renamed from: c  reason: collision with root package name */
    public String f16891c;

    /* renamed from: d  reason: collision with root package name */
    public String f16892d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16893e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16894f;

    public IconCompat a() {
        return this.f16890b;
    }

    public String b() {
        return this.f16892d;
    }

    public CharSequence c() {
        return this.f16889a;
    }

    public String d() {
        return this.f16891c;
    }

    public boolean e() {
        return this.f16893e;
    }

    public boolean f() {
        return this.f16894f;
    }

    public String g() {
        String str = this.f16891c;
        if (str != null) {
            return str;
        }
        if (this.f16889a != null) {
            return "name:" + ((Object) this.f16889a);
        }
        return "";
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().v() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
