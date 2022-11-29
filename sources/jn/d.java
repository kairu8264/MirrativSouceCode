package jn;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* loaded from: classes4.dex */
public class d extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }
}
