/**
 * This code was generated by
 * [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * <p>Do not edit this file as changes may cause incorrect behavior and will be lost once the code
 * is regenerated.
 *
 * @generated by codegen project: GeneratePropsJavaDelegate.js
 */
package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;

public class RNCSafeAreaViewManagerDelegate<
        T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNCSafeAreaViewManagerInterface<T>>
    extends BaseViewManagerDelegate<T, U> {
  public RNCSafeAreaViewManagerDelegate(U viewManager) {
    super(viewManager);
  }

  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "mode":
        mViewManager.setMode(view, (String) value);
        break;
      case "edges":
        mViewManager.setEdges(view, (ReadableMap) value);
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }
}
