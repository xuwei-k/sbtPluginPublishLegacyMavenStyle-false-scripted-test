enablePlugins(SbtPlugin, ScriptedPlugin)

organization := "com.example"

name := "foo"

scriptedLaunchOpts += ("-Dplugin.version=" + version.value)

scriptedBufferLog := false

sbtPluginPublishLegacyMavenStyle := false
