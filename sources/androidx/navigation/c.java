package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.navigation.x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@x.b(ActivityChooserModel.ATTRIBUTE_ACTIVITY)
/* loaded from: classes.dex */
public class c extends x<a> {

    /* renamed from: a  reason: collision with root package name */
    public Context f15691a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f15692b;

    /* loaded from: classes.dex */
    public static class a extends o {
        public Intent F;
        public String G;

        public a(x<? extends a> xVar) {
            super(xVar);
        }

        @Override // androidx.navigation.o
        public boolean D() {
            return false;
        }

        public final String H() {
            Intent intent = this.F;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        public final ComponentName J() {
            Intent intent = this.F;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        public final String K() {
            return this.G;
        }

        public final Intent L() {
            return this.F;
        }

        public final a M(String str) {
            if (this.F == null) {
                this.F = new Intent();
            }
            this.F.setAction(str);
            return this;
        }

        public final a N(ComponentName componentName) {
            if (this.F == null) {
                this.F = new Intent();
            }
            this.F.setComponent(componentName);
            return this;
        }

        public final a P(Uri uri) {
            if (this.F == null) {
                this.F = new Intent();
            }
            this.F.setData(uri);
            return this;
        }

        public final a Q(String str) {
            this.G = str;
            return this;
        }

        public final a R(String str) {
            if (this.F == null) {
                this.F = new Intent();
            }
            this.F.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.o
        public String toString() {
            ComponentName J = J();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (J != null) {
                sb2.append(" class=");
                sb2.append(J.getClassName());
            } else {
                String H = H();
                if (H != null) {
                    sb2.append(" action=");
                    sb2.append(H);
                }
            }
            return sb2.toString();
        }

        @Override // androidx.navigation.o
        public void w(Context context, AttributeSet attributeSet) {
            super.w(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a0.f15671a);
            String string = obtainAttributes.getString(a0.f15676f);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            R(string);
            String string2 = obtainAttributes.getString(a0.f15672b);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                N(new ComponentName(context, string2));
            }
            M(obtainAttributes.getString(a0.f15673c));
            String string3 = obtainAttributes.getString(a0.f15674d);
            if (string3 != null) {
                P(Uri.parse(string3));
            }
            Q(obtainAttributes.getString(a0.f15675e));
            obtainAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements x.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f15693a;

        /* renamed from: b  reason: collision with root package name */
        public final b3.b f15694b;

        public b3.b a() {
            return this.f15694b;
        }

        public int b() {
            return this.f15693a;
        }
    }

    public c(Context context) {
        this.f15691a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f15692b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // androidx.navigation.x
    public boolean e() {
        Activity activity = this.f15692b;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    @Override // androidx.navigation.x
    /* renamed from: f */
    public a a() {
        return new a(this);
    }

    public final Context g() {
        return this.f15691a;
    }

    @Override // androidx.navigation.x
    /* renamed from: h */
    public o b(a aVar, Bundle bundle, u uVar, x.a aVar2) {
        Intent intent;
        int intExtra;
        if (aVar.L() != null) {
            Intent intent2 = new Intent(aVar.L());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String K = aVar.K();
                if (!TextUtils.isEmpty(K)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(K);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + K);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z10 = aVar2 instanceof b;
            if (z10) {
                intent2.addFlags(((b) aVar2).b());
            }
            if (!(this.f15691a instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (uVar != null && uVar.g()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f15692b;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar.r());
            Resources resources = g().getResources();
            if (uVar != null) {
                int c10 = uVar.c();
                int d10 = uVar.d();
                if ((c10 > 0 && resources.getResourceTypeName(c10).equals("animator")) || (d10 > 0 && resources.getResourceTypeName(d10).equals("animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c10) + " and popExit resource " + resources.getResourceName(d10) + "when launching " + aVar);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c10);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d10);
                }
            }
            if (z10) {
                b3.b a10 = ((b) aVar2).a();
                if (a10 != null) {
                    c3.a.m(this.f15691a, intent2, a10.b());
                } else {
                    this.f15691a.startActivity(intent2);
                }
            } else {
                this.f15691a.startActivity(intent2);
            }
            if (uVar == null || this.f15692b == null) {
                return null;
            }
            int a11 = uVar.a();
            int b10 = uVar.b();
            if ((a11 <= 0 || !resources.getResourceTypeName(a11).equals("animator")) && (b10 <= 0 || !resources.getResourceTypeName(b10).equals("animator"))) {
                if (a11 >= 0 || b10 >= 0) {
                    this.f15692b.overridePendingTransition(Math.max(a11, 0), Math.max(b10, 0));
                    return null;
                }
                return null;
            }
            Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a11) + " and exit resource " + resources.getResourceName(b10) + "when launching " + aVar);
            return null;
        }
        throw new IllegalStateException("Destination " + aVar.r() + " does not have an Intent set.");
    }
}
