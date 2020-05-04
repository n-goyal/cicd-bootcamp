from os import listdir, path
import shutil


job_build_fullpath = '/var/lib/jenkins/jobs/spring-pipeline/builds'
print listdir(job_build_fullpath)

for build_dir in listdir(job_build_fullpath):
        if build_dir.isdigit() and int(build_dir) in range(5, 29):
                build_dir_fullpath = path.join(job_build_fullpath, build_dir)
                print "Deleting: " + build_dir_fullpath
                shutil.rmtree(build_dir_fullpath)
