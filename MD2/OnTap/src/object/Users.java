package object;


    public class Users {
        private int id;
        private String username;
        private String password;
        private Role role;
        private String status;


        public Users() {
        }

        public Users(int id, String username,String password, Role role, String status) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.role = role;
            this.status = status;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Role getRole() {
            return role;
        }

        public void setRole(Role role) {
            this.role = role;
        }

        @Override
        public String toString() {
            return "Users{" +
                    "id=" + id +
                    ", password='" + password + '\'' +
                    ", username='" + username + '\'' +
                    ", status='" + status + '\'' +
                    ", role='" + role.getId() + '\'' +
                    '}';
        }
    }

