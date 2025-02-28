package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.pauldemarco.flutterblue.FlutterBluePlugin;
import com.dooboolab.fluttersound.FlutterSoundPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterBluePlugin.registerWith(registry.registrarFor("com.pauldemarco.flutterblue.FlutterBluePlugin"));
    FlutterSoundPlugin.registerWith(registry.registrarFor("com.dooboolab.fluttersound.FlutterSoundPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
