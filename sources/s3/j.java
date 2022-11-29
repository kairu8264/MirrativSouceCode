package s3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import m3.d;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static Field f52014a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f52015b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f52016c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f52017d;

    /* loaded from: classes.dex */
    public static class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f52018a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f52019b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f52020c;

        /* renamed from: d  reason: collision with root package name */
        public Method f52021d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f52022e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f52023f = false;

        public a(ActionMode.Callback callback, TextView textView) {
            this.f52018a = callback;
            this.f52019b = textView;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }

        public ActionMode.Callback d() {
            return this.f52018a;
        }

        public final boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo.exported) {
                String str = activityInfo.permission;
                return str == null || context.checkSelfPermission(str) == 0;
            }
            return false;
        }

        public final void g(Menu menu) {
            Method declaredMethod;
            Context context = this.f52019b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f52023f) {
                this.f52023f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f52020c = cls;
                    this.f52021d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f52022e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f52020c = null;
                    this.f52021d = null;
                    this.f52022e = false;
                }
            }
            try {
                if (this.f52022e && this.f52020c.isInstance(menu)) {
                    declaredMethod = this.f52021d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c10 = c(context, packageManager);
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    ResolveInfo resolveInfo = c10.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f52019b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f52018a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f52018a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f52018a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f52018a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static Drawable[] a(TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i10 >= 17) {
            boolean z10 = textView.getLayoutDirection() == 1;
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z10) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
        return textView.getCompoundDrawables();
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int d(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f52017d) {
            f52016c = h("mMaxMode");
            f52017d = true;
        }
        Field field = f52016c;
        if (field == null || i(field, textView) != 1) {
            return -1;
        }
        if (!f52015b) {
            f52014a = h("mMaximum");
            f52015b = true;
        }
        Field field2 = f52014a;
        if (field2 != null) {
            return i(field2, textView);
        }
        return -1;
    }

    public static int e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    public static TextDirectionHeuristic f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        boolean z10 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z10) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public static d.a g(TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new d.a(textView.getTextMetricsParams());
        }
        d.a.C0589a c0589a = new d.a.C0589a(new TextPaint(textView.getPaint()));
        if (i10 >= 23) {
            c0589a.b(textView.getBreakStrategy());
            c0589a.c(textView.getHyphenationFrequency());
        }
        if (i10 >= 18) {
            c0589a.d(f(textView));
        }
        return c0589a.a();
    }

    public static Field h(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            Log.e("TextViewCompat", "Could not retrieve " + str + " field.");
            return field;
        }
    }

    public static int i(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    public static void j(TextView textView, ColorStateList colorStateList) {
        n3.h.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof n) {
            ((n) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void k(TextView textView, PorterDuff.Mode mode) {
        n3.h.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof n) {
            ((n) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void l(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i10 >= 17) {
            boolean z10 = textView.getLayoutDirection() == 1;
            Drawable drawable5 = z10 ? drawable3 : drawable;
            if (!z10) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void m(TextView textView, int i10) {
        int i11;
        n3.h.d(i10);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            textView.setFirstBaselineToTopHeight(i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (i12 >= 16 && !textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.ascent;
        } else {
            i11 = fontMetricsInt.top;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void n(TextView textView, int i10) {
        int i11;
        n3.h.d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT >= 16 && !textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.descent;
        } else {
            i11 = fontMetricsInt.bottom;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void o(TextView textView, int i10) {
        n3.h.d(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void p(TextView textView, m3.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(dVar.b());
        } else if (g(textView).a(dVar.a())) {
            textView.setText(dVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void q(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    public static void r(TextView textView, d.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 18) {
            textView.setTextDirection(e(aVar.d()));
        }
        if (i10 < 23) {
            float textScaleX = aVar.e().getTextScaleX();
            textView.getPaint().set(aVar.e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.e());
        textView.setBreakStrategy(aVar.b());
        textView.setHyphenationFrequency(aVar.c());
    }

    public static ActionMode.Callback s(ActionMode.Callback callback) {
        return (!(callback instanceof a) || Build.VERSION.SDK_INT < 26) ? callback : ((a) callback).d();
    }

    public static ActionMode.Callback t(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof a) || callback == null) ? callback : new a(callback, textView);
    }
}
