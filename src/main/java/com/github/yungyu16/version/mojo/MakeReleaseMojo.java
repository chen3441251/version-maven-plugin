package com.github.yungyu16.version.mojo;

import com.github.yungyu16.version.entity.ProjectVersion;
import com.github.yungyu16.version.util.VersionUtil;
import org.apache.maven.model.Model;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * 将快照版本变为正式版本 x.y.z-SNAPSHOT -> x.y.z
 *
 * @author yunyu16
 * @description Created by yunyu16 on 2020/5/7.
 */
@Mojo(name = "makeRelease", defaultPhase = LifecyclePhase.NONE)
public class MakeReleaseMojo extends BaseVersionMojo {
    @Override
    protected ProjectVersion nextVersion(Model model) {
        return VersionUtil.makeRelease(model);
    }
}
