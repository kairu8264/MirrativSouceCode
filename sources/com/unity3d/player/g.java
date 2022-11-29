package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class g extends Dialog implements TextWatcher, View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    private static int f28510c = 1627389952;

    /* renamed from: d  reason: collision with root package name */
    private static int f28511d = -1;

    /* renamed from: a  reason: collision with root package name */
    private Context f28512a;

    /* renamed from: b  reason: collision with root package name */
    private UnityPlayer f28513b;

    /* renamed from: e  reason: collision with root package name */
    private int f28514e;

    public g(Context context, UnityPlayer unityPlayer, String str, int i10, boolean z10, boolean z11, boolean z12, String str2, int i11, boolean z13) {
        super(context);
        this.f28512a = null;
        this.f28513b = null;
        this.f28512a = context;
        this.f28513b = unityPlayer;
        Window window = getWindow();
        window.requestFeature(1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
        final View createSoftInputView = createSoftInputView();
        setContentView(createSoftInputView);
        window.setLayout(-1, -2);
        window.clearFlags(2);
        window.clearFlags(134217728);
        window.clearFlags(67108864);
        EditText editText = (EditText) findViewById(1057292289);
        a(editText, str, i10, z10, z11, z12, str2, i11);
        ((Button) findViewById(1057292290)).setOnClickListener(this);
        this.f28514e = editText.getCurrentTextColor();
        a(z13);
        this.f28513b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.unity3d.player.g.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (createSoftInputView.isShown()) {
                    Rect rect = new Rect();
                    g.this.f28513b.getWindowVisibleDisplayFrame(rect);
                    int[] iArr = new int[2];
                    g.this.f28513b.getLocationOnScreen(iArr);
                    Point point = new Point(rect.left - iArr[0], rect.height() - createSoftInputView.getHeight());
                    Point point2 = new Point();
                    g.this.getWindow().getWindowManager().getDefaultDisplay().getSize(point2);
                    int height = g.this.f28513b.getHeight() - point2.y;
                    int height2 = g.this.f28513b.getHeight() - point.y;
                    if (height2 != height + createSoftInputView.getHeight()) {
                        g.this.f28513b.reportSoftInputIsVisible(true);
                    } else {
                        g.this.f28513b.reportSoftInputIsVisible(false);
                    }
                    g.this.f28513b.reportSoftInputArea(new Rect(point.x, point.y, createSoftInputView.getWidth(), height2));
                }
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.unity3d.player.g.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z14) {
                if (z14) {
                    g.this.getWindow().setSoftInputMode(5);
                }
            }
        });
        editText.requestFocus();
    }

    private static int a(int i10, boolean z10, boolean z11, boolean z12) {
        int i11 = (z10 ? 32768 : 524288) | (z11 ? 131072 : 0) | (z12 ? 128 : 0);
        if (i10 < 0 || i10 > 11) {
            return i11;
        }
        int[] iArr = {1, 16385, 12290, 17, 2, 3, 8289, 33, 1, 16417, 17, 8194};
        return (iArr[i10] & 2) != 0 ? iArr[i10] : iArr[i10] | i11;
    }

    private void a(EditText editText, String str, int i10, boolean z10, boolean z11, boolean z12, String str2, int i11) {
        editText.setImeOptions(6);
        editText.setText(str);
        editText.setHint(str2);
        editText.setHintTextColor(f28510c);
        editText.setInputType(a(i10, z10, z11, z12));
        editText.setImeOptions(33554432);
        if (i11 > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i11)});
        }
        editText.addTextChangedListener(this);
        editText.setSelection(editText.getText().length());
        editText.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z10) {
        ((EditText) findViewById(1057292289)).setSelection(0, 0);
        this.f28513b.reportSoftInputStr(str, 1, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        EditText editText = (EditText) findViewById(1057292289);
        if (editText == null) {
            return null;
        }
        return editText.getText().toString().trim();
    }

    public final String a() {
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) this.f28512a.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null) {
            return null;
        }
        String locale = currentInputMethodSubtype.getLocale();
        if (locale == null || locale.equals("")) {
            String mode = currentInputMethodSubtype.getMode();
            String extraValue = currentInputMethodSubtype.getExtraValue();
            return mode + " " + extraValue;
        }
        return locale;
    }

    public final void a(int i10) {
        EditText editText = (EditText) findViewById(1057292289);
        if (editText != null) {
            if (i10 > 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
            } else {
                editText.setFilters(new InputFilter[0]);
            }
        }
    }

    public final void a(int i10, int i11) {
        int i12;
        EditText editText = (EditText) findViewById(1057292289);
        if (editText == null || editText.getText().length() < (i12 = i11 + i10)) {
            return;
        }
        editText.setSelection(i10, i12);
    }

    public final void a(String str) {
        EditText editText = (EditText) findViewById(1057292289);
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
    }

    public final void a(boolean z10) {
        EditText editText = (EditText) findViewById(1057292289);
        Button button = (Button) findViewById(1057292290);
        View findViewById = findViewById(1057292291);
        if (z10) {
            editText.setBackgroundColor(0);
            editText.setTextColor(0);
            editText.setCursorVisible(false);
            editText.setOnClickListener(this);
            button.setTextColor(0);
            findViewById.setBackgroundColor(0);
            findViewById.setOnClickListener(this);
            return;
        }
        editText.setBackgroundColor(f28511d);
        editText.setTextColor(this.f28514e);
        editText.setCursorVisible(true);
        editText.setOnClickListener(null);
        button.setClickable(true);
        button.setTextColor(this.f28514e);
        findViewById.setBackgroundColor(f28511d);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f28513b.reportSoftInputStr(editable.toString(), 0, false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final View createSoftInputView() {
        RelativeLayout relativeLayout = new RelativeLayout(this.f28512a);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(f28511d);
        relativeLayout.setId(1057292291);
        EditText editText = new EditText(this.f28512a) { // from class: com.unity3d.player.g.3
            @Override // android.widget.TextView, android.view.View
            public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
                if (i10 == 4) {
                    g gVar = g.this;
                    gVar.a(gVar.b(), true);
                    return true;
                } else if (i10 == 84) {
                    return true;
                } else {
                    return super.onKeyPreIme(i10, keyEvent);
                }
            }

            @Override // android.widget.TextView
            public final void onSelectionChanged(int i10, int i11) {
                g.this.f28513b.reportSoftInputSelection(i10, i11 - i10);
            }

            @Override // android.widget.TextView, android.view.View
            public final void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((InputMethodManager) g.this.f28512a.getSystemService("input_method")).showSoftInput(this, 0);
                }
            }
        };
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(0, 1057292290);
        editText.setLayoutParams(layoutParams);
        editText.setId(1057292289);
        relativeLayout.addView(editText);
        Button button = new Button(this.f28512a);
        button.setText(this.f28512a.getResources().getIdentifier("ok", "string", "android"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(11);
        button.setLayoutParams(layoutParams2);
        button.setId(1057292290);
        button.setBackgroundColor(0);
        relativeLayout.addView(button);
        ((EditText) relativeLayout.findViewById(1057292289)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.unity3d.player.g.4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                if (i10 == 6) {
                    g gVar = g.this;
                    gVar.a(gVar.b(), false);
                }
                return false;
            }
        });
        relativeLayout.setPadding(16, 16, 16, 16);
        return relativeLayout;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        a(b(), true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a(b(), false);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
