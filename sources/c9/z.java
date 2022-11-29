package c9;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dena.mirrativ.catalog.search.SearchAppFragment;
import java.util.ArrayList;
import r8.h1;

/* loaded from: classes.dex */
public final class z extends androidx.fragment.app.u {

    /* renamed from: h  reason: collision with root package name */
    public final Context f18994h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        jo.p.h(context, "context");
        jo.p.h(fragmentManager, "fm");
        this.f18994h = context;
    }

    @Override // j5.a
    public int c() {
        ArrayList arrayList;
        arrayList = a0.f18886a;
        return arrayList.size();
    }

    @Override // j5.a
    public CharSequence e(int i10) {
        ArrayList arrayList;
        Context context = this.f18994h;
        arrayList = a0.f18886a;
        Object obj = arrayList.get(i10);
        jo.p.g(obj, "SEARCH_TAB_TITLES[position]");
        String string = context.getString(((Number) obj).intValue());
        jo.p.g(string, "context.getString(SEARCH_TAB_TITLES[position])");
        return string;
    }

    @Override // androidx.fragment.app.u
    public Fragment q(int i10) {
        if (i10 == u.STREAMS.c()) {
            return new y();
        }
        if (i10 == u.USERS.c()) {
            return new k0();
        }
        if (i10 == u.APPS.c()) {
            return new SearchAppFragment();
        }
        throw new IllegalStateException();
    }

    public final String t(int i10) {
        if (i10 == u.STREAMS.c()) {
            String string = this.f18994h.getString(h1.text_search_broadcasts);
            jo.p.g(string, "context.getString(R.string.text_search_broadcasts)");
            return string;
        } else if (i10 == u.USERS.c()) {
            String string2 = this.f18994h.getString(h1.text_search_users);
            jo.p.g(string2, "context.getString(R.string.text_search_users)");
            return string2;
        } else if (i10 == u.APPS.c()) {
            String string3 = this.f18994h.getString(h1.text_search_app_hint);
            jo.p.g(string3, "context.getString(R.string.text_search_app_hint)");
            return string3;
        } else {
            return "";
        }
    }
}
