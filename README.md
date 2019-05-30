web so 2


if happen error
! [rejected] master -> master (fetch first) error: failed to push some refs to '' hint: Updates were rejected because the remote contains work that you do hint: not have locally. This is usually caused by another repository pushing

solution: 
git push origin master --force 
or short of force -f 
git push origin master -f
