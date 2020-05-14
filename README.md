# cicd-bootcamp
devops training handson projects
# test-trigger
# configuring tomcat using ansible:
Ansible playbook contains steps to configure a tomcat service on a ubuntu desktop. tomcat.service file is used to enable tomcat as a service on ubuntu machine. this ansible playbook with a few modificaitons can be used on a cloud server or in a local system to configure tomcat. I used this to configure tomcat on my ubuntu machine by running the following command.
  ansible-playbook -i hosts myplay.yml
